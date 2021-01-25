package tienda_v3;

import java.util.Scanner;

public class Tienda_V3 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        String[] articulos={"Agua", "Coca-cola", "Patatas Fritas", "Donut", 
            "Pipas"};
        double[] precios={1,2,2.5,3,2};
        int[] stock={10, 10, 10, 10, 10};
        int[] cantidad_producto=new int[articulos.length];
        boolean stock_queda;
        String nombre;
                
        double total_sin_IVA, coste_IVA ,total_con_IVA,recargo_plazos,recargo_pago,coste_plazo,tasa_IVA=21;
        int plazos,forma_pago,espera;
        coste_IVA=0;
        total_con_IVA=0;
        double tarjeta=0.02;
        double plazo=0.01;
        
        System.out.print("  *+++++++++++++++++++++++++++++++++++++*   ");
        System.out.print("**+** Bienvenido a Centro Alimentacion**+** ");
        System.out.print("  *+++++++++++++++++++++++++++++++++++++*   ");
        
        System.out.println("                   *****                   ");
        System.out.println("                   ***                     ");
        System.out.println("                   *                       ");
        System.out.println("                *******                    ");
        System.out.println("            ***************                ");
        System.out.println("          *******************              ");
        System.out.println("        ***********************            ");
        System.out.println("      ***************************          ");
        System.out.println("    *******************************        ");
        System.out.println("    *******************************        ");
        System.out.println("    *******************************        ");
        System.out.println("    *******************************        ");
        System.out.println("      ***************************          ");
        System.out.println("        ***********************            ");
        System.out.println("          *******************              ");
        System.out.println("            ***************                ");
        System.out.println("                *******                    ");
        
        
        for (int i=0; i<articulos.length;i++){
            System.out.println(articulos[i]+"_______"+precios[i]);
        }
        