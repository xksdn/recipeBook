package com.example.second;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CookRecipeResponse {
    @SerializedName("COOKRCP01")
    @Expose
    private CookRcp01 cookRcp01;

    public CookRcp01 getCookRcp01() {
        return cookRcp01;
    }

    public static class CookRcp01 {
        @SerializedName("total_count")
        @Expose
        private String totalCount;

        @SerializedName("row")
        @Expose
        private List<RecipeRow> row;

        @SerializedName("RESULT")
        @Expose
        private Result result;

        public String getTotalCount() {
            return totalCount;
        }

        public List<RecipeRow> getRowList() {
            return row;
        }

        public Result getResult() {
            return result;
        }
    }

    public static class RecipeRow {

        @SerializedName("RCP_SEQ") // 일련번호
        @Expose
        private String RCP_SEQ;

        @SerializedName("RCP_NM") // 메뉴명
        @Expose
        private String RCP_NM;

        @SerializedName("RCP_WAY2") // 조리방법
        @Expose
        private String RCP_WAY2;

        @SerializedName("RCP_PAT2") // 요리종류
        @Expose
        private String RCP_PAT2;

        @SerializedName("INFO_WGT") // 중량 (1인분)
        @Expose
        private String INFO_WGT;

        @SerializedName("INFO_ENG") // 열량
        @Expose
        private String INFO_ENG;

        @SerializedName("INFO_CAR") // 탄수화물
        @Expose
        private String INFO_CAR;

        @SerializedName("INFO_PRO") // 단백질
        @Expose
        private String INFO_PRO;

        @SerializedName("INFO_FAT") // 지방
        @Expose
        private String INFO_FAT;

        @SerializedName("INFO_NA") // 나트륨
        @Expose
        private String INFO_NA;

        @SerializedName("HASH_TAG") // 해쉬태그
        @Expose
        private String HASH_TAG;

        @SerializedName("ATT_FILE_NO_MAIN") // 이미지경로(소)
        @Expose
        private String ATT_FILE_NO_MAIN;

        @SerializedName("ATT_FILE_NO_MK") // 이미지경로(대)
        @Expose
        private String ATT_FILE_NO_MK;

        @SerializedName("RCP_PARTS_DTLS") // 재료정보
        @Expose
        private String RCP_PARTS_DTLS;

        @SerializedName("MANUAL01") // 만드는법 01
        @Expose
        private String MANUAL01;

        @SerializedName("MANUAL_IMG01") // 만드는법 이미지 01
        @Expose
        private String MANUAL_IMG01;

        @SerializedName("MANUAL02")
        @Expose
        private String MANUAL02;

        @SerializedName("MANUAL_IMG02")
        @Expose
        private String MANUAL_IMG02;

        @SerializedName("MANUAL03")
        @Expose
        private String MANUAL03;

        @SerializedName("MANUAL_IMG03")
        @Expose
        private String MANUAL_IMG03;

        @SerializedName("MANUAL04")
        @Expose
        private String MANUAL04;

        @SerializedName("MANUAL_IMG04")
        @Expose
        private String MANUAL_IMG04;

        @SerializedName("MANUAL05")
        @Expose
        private String MANUAL05;

        @SerializedName("MANUAL_IMG05")
        @Expose
        private String MANUAL_IMG05;

        @SerializedName("MANUAL06")
        @Expose
        private String MANUAL06;

        @SerializedName("MANUAL_IMG06")
        @Expose
        private String MANUAL_IMG06;

        @SerializedName("MANUAL07")
        @Expose
        private String MANUAL07;

        @SerializedName("MANUAL_IMG07")
        @Expose
        private String MANUAL_IMG07;

        @SerializedName("MANUAL08")
        @Expose
        private String MANUAL08;

        @SerializedName("MANUAL_IMG08")
        @Expose
        private String MANUAL_IMG08;

        @SerializedName("MANUAL09")
        @Expose
        private String MANUAL09;

        @SerializedName("MANUAL_IMG09")
        @Expose
        private String MANUAL_IMG09;

        @SerializedName("MANUAL10")
        @Expose
        private String MANUAL10;

        @SerializedName("MANUAL_IMG10")
        @Expose
        private String MANUAL_IMG10;

        @SerializedName("MANUAL11")
        @Expose
        private String MANUAL11;

        @SerializedName("MANUAL_IMG11")
        @Expose
        private String MANUAL_IMG11;

        @SerializedName("MANUAL12")
        @Expose
        private String MANUAL12;

        @SerializedName("MANUAL_IMG12")
        @Expose
        private String MANUAL_IMG12;

        @SerializedName("MANUAL13")
        @Expose
        private String MANUAL13;

        @SerializedName("MANUAL_IMG13")
        @Expose
        private String MANUAL_IMG13;

        @SerializedName("MANUAL14")
        @Expose
        private String MANUAL14;

        @SerializedName("MANUAL_IMG14")
        @Expose
        private String MANUAL_IMG14;

        @SerializedName("MANUAL15")
        @Expose
        private String MANUAL15;

        @SerializedName("MANUAL_IMG15")
        @Expose
        private String MANUAL_IMG15;

        @SerializedName("MANUAL16")
        @Expose
        private String MANUAL16;

        @SerializedName("MANUAL_IMG16")
        @Expose
        private String MANUAL_IMG16;

        @SerializedName("MANUAL17")
        @Expose
        private String MANUAL17;

        @SerializedName("MANUAL_IMG17")
        @Expose
        private String MANUAL_IMG17;

        @SerializedName("MANUAL18")
        @Expose
        private String MANUAL18;

        @SerializedName("MANUAL_IMG18")
        @Expose
        private String MANUAL_IMG18;

        @SerializedName("MANUAL19")
        @Expose
        private String MANUAL19;

        @SerializedName("MANUAL_IMG19")
        @Expose
        private String MANUAL_IMG19;

        @SerializedName("MANUAL20")
        @Expose
        private String MANUAL20;

        @SerializedName("MANUAL_IMG20")
        @Expose
        private String MANUAL_IMG20;

        @SerializedName("RCP_NA_TIP")
        @Expose
        private String RCP_NA_TIP;


        public String getRCP_SEQ() {
            return RCP_SEQ;
        }

        public String getRCP_NM() {
            return RCP_NM;
        }

        public String getRCP_WAY2() {
            return RCP_WAY2;
        }

        public String getRCP_PAT2() {
            return RCP_PAT2;
        }

        public String getINFO_WGT() {
            return INFO_WGT;
        }

        public String getINFO_ENG() {
            return INFO_ENG;
        }

        public String getINFO_CAR() {
            return INFO_CAR;
        }

        public String getINFO_PRO() {
            return INFO_PRO;
        }

        public String getINFO_FAT() {
            return INFO_FAT;
        }

        public String getINFO_NA() {
            return INFO_NA;
        }

        public String getHASH_TAG() {
            return HASH_TAG;
        }

        public String getATT_FILE_NO_MAIN() {
            return ATT_FILE_NO_MAIN;
        }

        public String getATT_FILE_NO_MK() {
            return ATT_FILE_NO_MK;
        }

        public String getRCP_PARTS_DTLS() {
            return RCP_PARTS_DTLS;
        }

        public String getMANUAL01() {
            return MANUAL01;
        }

        public String getMANUAL_IMG01() {
            return MANUAL_IMG01;
        }

        public String getMANUAL02() {
            return MANUAL02;
        }

        public String getMANUAL_IMG02() {
            return MANUAL_IMG02;
        }

        public String getMANUAL03() {
            return MANUAL03;
        }

        public String getMANUAL_IMG03() {
            return MANUAL_IMG03;
        }

        public String getMANUAL04() {
            return MANUAL04;
        }

        public String getMANUAL_IMG04() {
            return MANUAL_IMG04;
        }

        public String getMANUAL05() {
            return MANUAL05;
        }

        public String getMANUAL_IMG05() {
            return MANUAL_IMG05;
        }

        public String getMANUAL06() {
            return MANUAL06;
        }

        public String getMANUAL_IMG06() {
            return MANUAL_IMG06;
        }

        public String getMANUAL07() {
            return MANUAL07;
        }

        public String getMANUAL_IMG07() {
            return MANUAL_IMG07;
        }

        public String getMANUAL08() {
            return MANUAL08;
        }

        public String getMANUAL_IMG08() {
            return MANUAL_IMG08;
        }

        public String getMANUAL09() {
            return MANUAL09;
        }

        public String getMANUAL_IMG09() {
            return MANUAL_IMG09;
        }

        public String getMANUAL10() {
            return MANUAL10;
        }

        public String getMANUAL_IMG10() {
            return MANUAL_IMG10;
        }

        public String getMANUAL11() {
            return MANUAL11;
        }

        public String getMANUAL_IMG11() {
            return MANUAL_IMG11;
        }

        public String getMANUAL12() {
            return MANUAL12;
        }

        public String getMANUAL_IMG12() {
            return MANUAL_IMG12;
        }

        public String getMANUAL13() {
            return MANUAL13;
        }

        public String getMANUAL_IMG13() {
            return MANUAL_IMG13;
        }

        public String getMANUAL14() {
            return MANUAL14;
        }

        public String getMANUAL_IMG14() {
            return MANUAL_IMG14;
        }

        public String getMANUAL15() {
            return MANUAL15;
        }

        public String getMANUAL_IMG15() {
            return MANUAL_IMG15;
        }

        public String getMANUAL16() {
            return MANUAL16;
        }

        public String getMANUAL_IMG16() {
            return MANUAL_IMG16;
        }

        public String getMANUAL17() {
            return MANUAL17;
        }

        public String getMANUAL_IMG17() {
            return MANUAL_IMG17;
        }

        public String getMANUAL18() {
            return MANUAL18;
        }

        public String getMANUAL_IMG18() {
            return MANUAL_IMG18;
        }

        public String getMANUAL19() {
            return MANUAL19;
        }

        public String getMANUAL_IMG19() {
            return MANUAL_IMG19;
        }

        public String getMANUAL20() {
            return MANUAL20;
        }

        public String getMANUAL_IMG20() {
            return MANUAL_IMG20;
        }

        public String getRCP_NA_TIP() {
            return RCP_NA_TIP;
        }
    }
    public static class Result {
        @SerializedName("MSG")
        @Expose
        private String msg;

        @SerializedName("CODE")
        @Expose
        private String code;

        public String getMsg() {
            return msg;
        }

        public String getCode() {
            return code;
        }
    }
}
