package com.example.second;

import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class dbStart extends AppCompatActivity {

    private databaseManager db;
    private TextView txtInput;
    private TextView txtOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.db);

        db = new databaseManager(getApplicationContext());

        txtInput = findViewById(R.id.txt_input);
        txtOutput = findViewById(R.id.txt_output);

        Button btnInput = findViewById(R.id.btn_input);
        Button btnOutput = findViewById(R.id.btn_output);

        btnInput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Retrofit을 사용하여 네트워크 작업을 비동기적으로 수행합니다.
                Retrofit_interface service = retrofit_client.getApiService();
                Call<CookRecipeResponse> call = service.stock_api_get("1", "5");
                call.enqueue(new Callback<CookRecipeResponse>() {
                    @Override
                    public void onResponse(Call<CookRecipeResponse> call, Response<CookRecipeResponse> response) {
                        if (response.isSuccessful()) {
                            CookRecipeResponse recipeResponse = response.body();
                            // 데이터베이스에 데이터를 삽입합니다.
                            ArrayList<CookRecipeResponse> recipeList = new ArrayList<>();
                            recipeList.add(recipeResponse);
                            db.insertData(recipeList);
                            txtInput.setText("잘 가져왔고 DB에 저장되었습니다!");
                        } else {
                            // 네트워크 요청 실패 처리
                            txtInput.setText("데이터를 가져오는 데 실패했습니다ㅠㅠ");
                        }
                    }

                    @Override
                    public void onFailure(Call<CookRecipeResponse> call, Throwable t) {
                        // 네트워크 요청 실패 처리
                        txtInput.setText("네트워크 요청이 실패했습니다.");
                    }
                });
            }
        });

        btnOutput.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 백그라운드 스레드에서 데이터베이스 작업을 수행합니다.
                AsyncTask<Void, Void, ArrayList<CookRecipeResponse>> databaseTask = new AsyncTask<Void, Void, ArrayList<CookRecipeResponse>>() {
                    @Override
                    protected ArrayList<CookRecipeResponse> doInBackground(Void... voids) {
                        return db.getItems();
                    }

                    @Override
                    protected void onPostExecute(ArrayList<CookRecipeResponse> recipes) {
                        super.onPostExecute(recipes);
                        // 결과를 UI에 반영합니다.
                        StringBuilder output = new StringBuilder();
                        for (CookRecipeResponse recipe : recipes) {
                            output.append("레시피 이름: ").append(recipe.getRCP_NM()).append("\n");
                            output.append("재료: ").append(recipe.getRCP_PARTS_DTLS()).append("\n");
                            output.append("조리 방법: ").append(recipe.getRCP_WAY2()).append("\n\n");
                        }
                        txtOutput.setText(output.toString());
                    }
                };
                databaseTask.execute();
            }
        });

    }
}
