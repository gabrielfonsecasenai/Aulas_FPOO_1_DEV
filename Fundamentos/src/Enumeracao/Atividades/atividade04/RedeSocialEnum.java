package Enumeracao.Atividades.atividade04;

public enum RedeSocialEnum {
    INSTAGRAM("Instagram"),
    FACEBOOK("Facebook"),
    TIKTOK("TikTok");
    
    private String redeSocial;

    private RedeSocialEnum(String redeSocial) {
        this.redeSocial = redeSocial;
    }

    public String getRedeSocial() {
        return redeSocial;
    }
    
}
