/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculopascoa;

/**
 *
 * @author BernardoOliveiraBenc
 */
public class Calculadora {
    
    public static int calcularDiaPascoa(int ano) {
        
        int a = ano % 19;
        int b = ano / 100;
        int c = ano % 100;
        int d = b / 4;
        int e = b % 4;
        int g = (8 * b + 13) / 25;
        int h = (19 * a + b - d - g + 15) % 30;
        int j = c / 4;
        int k = c % 4;
        int m = (a + 11 * h) / 319;
        int r = (2 * e + 2 * j - k - h + m + 32) % 7;
        int n = (h - m + r + 90) / 25;
        int p = (h - m + r + n + 19) % 32;

        return p;
        
    }
    
    public static int calcularMesPascoa(int ano){
        
        int a = ano % 19;
        int b = ano / 100;
        int c = ano % 100;
        int d = b / 4;
        int e = b % 4;
        int g = (8 * b + 13) / 25;
        int h = (19 * a + b - d - g + 15) % 30;
        int j = c / 4;
        int k = c % 4;
        int m = (a + 11 * h) / 319;
        int r = (2 * e + 2 * j - k - h + m + 32) % 7;
        int n = (h - m + r + 90) / 25;

        return n;
        
    }
    
    public static String definirMes(int n){
        
        String resultado;
        
        switch (n) {
            case 1:
                resultado = "Janeiro";
                break;
            case 2:
                resultado = "Fevereiro";
                break;
            case 3:
                resultado = "Março";
                break;
            case 4:
                resultado = "Abril";
                break;
            case 5:
                resultado = "Maio";
                break;
            case 6:
                resultado = "Junho";
                break;
            case 7:
                resultado = "Julho";
                break;
            case 8:
                resultado = "Agosto";
                break;
            case 9:
                resultado = "Setembro";
                break;
            case 10:
                resultado = "Outubro";
                break;
            case 11:
                resultado = "Novembro";
                break;
            case 12:
                resultado = "Dezembro";
                break;
            default:
                resultado = "Erro";
        }

        return resultado;
        
    }
    
}
