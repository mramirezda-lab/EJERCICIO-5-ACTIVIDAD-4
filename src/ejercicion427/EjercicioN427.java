package ejercicion427;

import java.io.*;

public class EjercicioN427 {

    public static void main(String[] args) {
        // Mostrar el formulario
        Principal formulario = new Principal();
        formulario.setVisible(true);

        // Llamar al método que lee el archivo (opcional)
        leerArchivo();
    }

    public static void leerArchivo() {
        String nombreArchivo = "C:/Users/Migue/Documents/NetBeansProjects/EjercicioN427/prueba.txt";

        try (FileInputStream archivo = new FileInputStream(nombreArchivo);
             InputStreamReader conversor = new InputStreamReader(archivo);
             BufferedReader filtro = new BufferedReader(conversor)) {

            String linea;
            while ((linea = filtro.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("No se pudo leer el archivo: " + e.getMessage());
        }
    }
}
