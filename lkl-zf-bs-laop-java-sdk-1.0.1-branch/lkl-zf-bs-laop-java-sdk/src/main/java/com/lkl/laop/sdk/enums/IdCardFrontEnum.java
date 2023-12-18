package com.lkl.laop.sdk.enums;

public enum IdCardFrontEnum {

    FR_ID_CARD_FRONT("FR_ID_CARD_FRONT", "法人身份证正面"),
    FR_ID_CARD_BEHIND("FR_ID_CARD_BEHIND", "法人身份证反面"),
    ID_CARD_FRONT("ID_CARD_FRONT", "身份证正面"),
    ID_CARD_BEHIND("ID_CARD_BEHIND", "身份证反面"),
    BANK_CARD("BANK_CARD", "银行卡"),
    BUSINESS_LICENCE("BUSINESS_LICENCE", "营业执照"),
    MERCHANT_PHOTO("MERCHANT_PHOTO", "商户门头照"),
    SHOPINNER("SHOPINNER", "商铺内部照片"),
    XY("XY", "线下纸质协议"),
    NETWORK_XY("NETWORK_XY", "电子协议"),
    HT("HT", "租赁合同"),
    COOPERATION_QUALIFICATION_PROOF("COOPERATION_QUALIFICATION_PROOF", "合作资质证明"),
    FOOD_QUALIFICATION_PROOF("FOOD_QUALIFICATION_PROOF", "食品经营相关资质"),
    OTHERS("OTHERS", "其他");


    private final String code;

    private final String name;


    IdCardFrontEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }
}
