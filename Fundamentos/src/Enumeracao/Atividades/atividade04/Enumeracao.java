package Enumeracao.Atividades.atividade04;

public class Enumeracao {
    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial("Rede Social: ", RedeSocialEnum.FACEBOOK.getRedeSocial());
        System.out.println(redeSocial);
        
        redeSocial.setRedeSocial(RedeSocialEnum.INSTAGRAM.getRedeSocial());
        System.out.println(redeSocial);
        
        redeSocial.setRedeSocial(RedeSocialEnum.TIKTOK.getRedeSocial());
        System.out.println(redeSocial);
    }
}
