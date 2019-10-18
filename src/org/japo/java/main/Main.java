//* 
 /* Copyright 2019 Adrian Bueno Olmedo <adrian.bueno.alum@iescamp.es>.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Mario Merlos Abella <mario.merlos.alum@iescamp.es>
 */
public class Main {

    public static final Scanner SCN
            = new Scanner(System.in, "Windows-1252")
                    .useLocale(Locale.ENGLISH).useDelimiter("\\s+");

    public static void main(String[] args) {
        double BTri, HTri, ATri;

        try {
            // Leer datos   
            System.out.printf("Base triángulo ....: ");
            BTri = SCN.nextInt();
            System.out.printf("Altura triángulo ..:  ");
            HTri = SCN.nextInt();
            ATri = BTri*HTri/2;
            System.out.printf("Altura triángulo ..:  ");
            //Mensaje
            System.out.printf("Área triángulo ....: %.2f cm%n", ATri);
        } catch (Exception e) {
           
            //Mensaje
            System.out.printf("ERROR: Entrada incorrecta");

        } finally {
            //Borrar buffer
            SCN.nextLine();
        }
    }
}