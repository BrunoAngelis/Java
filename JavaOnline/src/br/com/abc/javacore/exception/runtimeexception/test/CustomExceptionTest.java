package br.com.abc.javacore.exception.runtimeexception.test;

import br.com.abc.javacore.exception.customexceptions.LoginInvalidoException;

public class CustomExceptionTest {
    public static void main(String[] args) {
        try {
            logar();
        } catch (LoginInvalidoException e) {
            e.printStackTrace();
        }
    }

    public static void logar() throws LoginInvalidoException{
        String usuario = "Goku";
        String senha = "111";
        String usuarioDigitado = "Goku";
        String senhaDigitada = "111";
        if (!usuario.equals(usuarioDigitado) || !senha.equals(senhaDigitada)){
            throw new LoginInvalidoException();
        }else{
            System.out.println("Logado!");
        }
    }
}
