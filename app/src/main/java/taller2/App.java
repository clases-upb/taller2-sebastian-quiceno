/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        System.out.println(Calcular_saldo(2000000, 10, 05));
        System.out.println(Calcular_tip(100f));
        System.out.println(Obtener_puntos(2, 5, 3));
        System.out.println(Calcular_definitiva(5,4, 1, 5, 4, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));
        System.out.println(Calcular_para_ganar(3, 3, 3, 3, 0.3f, 0.3f, 0.3f, 0.1f, 0.3f));
        System.out.println(Calcular_para_ganar(3, 3, 3, 3, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));
        System.out.println("aqui "+Calcular_salario(40, 10, 5, 20000));
        System.out.println(Calcular_salario(200, 50, 30, 150));
        System.out.println(Calcular_area_triangulo(5, 4));
        System.out.println(Calcular_perimetro_cuadrado(4));
        System.out.println(Calcular_volumen_cilindro(5, 4));
        System.out.println(Calcular_area_circulo(4));
        
    }


    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */
    public static int Calcular_saldo(int base_dinero, int total_recaudos, int total_retiros){
        try {
            int saldo_taquilla=0;
            if (base_dinero == 2000000) {
                saldo_taquilla=base_dinero+total_recaudos-total_retiros;
                return saldo_taquilla;
            } else {
                return -1;
            }
            
        } catch (Exception e) {
            return -1;
        }
    }
    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */
    public static String Calcular_tip(float consumo_cliente){
        try {
            String retorno = "";
            double total =0, total_propina=0, total_impuestoconsumo=0;
            final double propina = 0.1, impuesto_consumo=0.08;
            if (consumo_cliente > 0) {
                total_propina=consumo_cliente*propina;
                total_impuestoconsumo=consumo_cliente*impuesto_consumo;
                total = consumo_cliente+total_propina+total_impuestoconsumo;
                retorno =  "valor comida: $"+consumo_cliente+" - valor propina $"+total_propina+" - valor impoconsumo $"+total_impuestoconsumo+" - total a pagar $"+total;
                return retorno;

            } else {
                return "Error calculando consumo";
            }
            

        } catch (Exception e) {
            return "Error en la función Calcular_tip";
            
        }

    }



    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */
    public static int Obtener_puntos(int part_gan, int part_perd, int part_emp){
        try {
            int total_puntos =0;
            final int punt_gan =3, punt_perd =0, punt_emp=1;
            if (part_gan >= 0 && part_perd >= 0 && part_emp >= 0) {
                total_puntos= part_gan*punt_gan+part_perd*punt_perd+part_emp*punt_emp;
                return total_puntos;
                
            } else {
                return -1;
            }
        } catch (Exception e) {
                return -1;
        }

    }


    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */
    public static float Calcular_definitiva(float n1, float n2, float n3, float n4, float n5, float porcentaje_1, float porcentaje_2, float porcentaje_3, float porcentaje_4, float porcentaje_5){
        try {
            float val_n1=0, val_n2=0, val_n3=0, val_n4=0, val_n5=0, definitiva=0;
            if (n1 >= 0 && n1 <=5 && n2 >= 0 && n2 <=5 && n3 >= 0 && n3 <=5 &&  n4 >= 0 && n4 <=5 && n5 >= 0 && n5 <=5 && porcentaje_1 >=0 && porcentaje_1<= 1 && porcentaje_2 >=0 && porcentaje_2<= 1 && porcentaje_3 >=0 && porcentaje_3<= 1 && porcentaje_4 >=0 && porcentaje_4<= 1 && porcentaje_5 >=0 && porcentaje_5<= 1 && porcentaje_1+porcentaje_2+porcentaje_3+porcentaje_4+porcentaje_5 == 1) {
                val_n1=n1*porcentaje_1;
                val_n2=n2*porcentaje_2;
                val_n3=n3*porcentaje_3;
                val_n4=n4*porcentaje_4;
                val_n5=n5*porcentaje_5;
                definitiva= val_n1+val_n2+val_n3+val_n4+val_n5;
                return definitiva;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }

    }


    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */
    public static float Calcular_para_ganar(float n1, float n2, float n3, float n4, float porcentaje_1, float porcentaje_2, float porcentaje_3, float porcentaje_4, float porcentaje_5){
        try {
            float val_n1=0, val_n2=0, val_n3=0, val_n4=0, n5=0;
            final int nota_min=3;
            if (n1 >= 0 && n1 <=5 && n2 >= 0 && n2 <=5 && n3 >= 0 && n3 <=5 &&  n4 >= 0 && n4 <=5 && porcentaje_1 >=0 && porcentaje_1<= 1 && porcentaje_2 >=0 && porcentaje_2<= 1 && porcentaje_3 >=0 && porcentaje_3<= 1 && porcentaje_4 >=0 && porcentaje_4<= 1 && porcentaje_5 >=0 && porcentaje_5<= 1 && porcentaje_1+porcentaje_2+porcentaje_3+porcentaje_4+porcentaje_5 == 1) {
                val_n1=n1*porcentaje_1;
                val_n2=n2*porcentaje_2;
                val_n3=n3*porcentaje_3;
                val_n4=n4*porcentaje_4;
                n5= (nota_min-val_n1-val_n2-val_n3-val_n4)/porcentaje_5;
                return n5;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }
    }


    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_salario(float horas_normales, float horas_diurnas, float horas_nocturnas, float valor_hora){
        try {
            final float valor_diurnas=0.15f, valor_nocturnas=0.35f;
            float total=0, total_diurnas=0, total_nocturnas=0;
            if (valor_hora >=0) {
                total_diurnas=(valor_hora*horas_diurnas)+(valor_hora*horas_diurnas)*valor_diurnas;
                total_nocturnas=(valor_hora*horas_nocturnas)+(valor_hora*horas_nocturnas)*valor_nocturnas;
                total=horas_normales*valor_hora+total_diurnas+total_nocturnas;
                return total;
            }
             else {
                return -1;
            }
        } catch (Exception e) {
                return -1;
        }

    }


    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_area_triangulo(float base, float altura){
        try {
            float resultado=0;
            if (base>0 && altura>0) {
                resultado=(base*altura)/2;
                return resultado;
            
            }else {
                return -1;
            }


        } catch (Exception e) {
            return -1;
        }

    }

    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_perimetro_cuadrado(float lado){
        try {
            float resultado=0;
            if (lado >0) {
                resultado=lado+lado+lado+lado;
                return resultado;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }

    }

    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_volumen_cilindro(float rad_base, float altura){
        try {
            float resultado=0;
            final float pi=3.1415927f;
            if (rad_base>0 && altura>0) {
                resultado= pi*rad_base*rad_base*altura;
                return resultado;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }


    }

    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
    public static float Calcular_area_circulo(float radio_circ){
        try {
            float resultado=0;
            final float pi=3.1415927f;
            if (radio_circ>0) {
                resultado= pi*radio_circ*radio_circ;
                return resultado;
            } else {
                return -1;
            }
        } catch (Exception e) {
            return -1;
        }


    }




}
