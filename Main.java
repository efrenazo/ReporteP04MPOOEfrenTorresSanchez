public class Main {

    public static class Calificaciones {
        private double[] calificaciones;

        public Calificaciones(double[] calificaciones) {
            this.calificaciones = calificaciones;
        }

        public double calcularPromedio() {
            double suma = 0;

            for (double calificacion : calificaciones) {
                suma += calificacion;
            }

            return suma / calificaciones.length;
        }

        public double obtenerMaximo() {
            double maximo = calificaciones[0];

            for (double calificacion : calificaciones) {
                if (calificacion > maximo) {
                    maximo = calificacion;
                }
            }

            return maximo;
        }

        public double obtenerMinimo() {
            double minimo = calificaciones[0];

            for (double calificacion : calificaciones) {
                if (calificacion < minimo) {
                    minimo = calificacion;
                }
            }

            return minimo;
        }

        public int contarAprobados() {
            int aprobados = 0;

            for (double calificacion : calificaciones) {
                if (calificacion >= 70) {
                    aprobados++;
                }
            }

            return aprobados;
        }

        public void mostrarCalificaciones() {
            System.out.println("Calificaciones analizadas:");

            for (int i = 0; i < calificaciones.length; i++) {
                System.out.println("Alumno " + (i + 1) + ": " + calificaciones[i]);
            }
        }
    }

    public static void main(String[] args) {

        double[] calificaciones = {
            85, 72, 90, 65, 78,
            55, 88, 92, 70, 64,
            76, 81, 59, 95, 73,
            68, 87, 71, 60, 84
        };

        Calificaciones grupo = new Calificaciones(calificaciones);

        grupo.mostrarCalificaciones();

        System.out.println("\nRESULTADOS");
        System.out.println("Promedio: " + grupo.calcularPromedio());
        System.out.println("Calificación máxima: " + grupo.obtenerMaximo());
        System.out.println("Calificación mínima: " + grupo.obtenerMinimo());
        System.out.println("Alumnos aprobados: " + grupo.contarAprobados());
    }
}