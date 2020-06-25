public class Variable {

    public static void main(String[] args) {
        int sizeOfMemInGPU = 6; //количество Гб в процессоре видеокарты
        System.out.println("Количество памяти в процессоре видеокарты (Гб) = " + sizeOfMemInGPU);

        byte countOfBitInSystem = 64; //64 разрядная система
        System.out.println("Разрядность системы = " + countOfBitInSystem);

        short winVersion = 10;//Windows 10
        System.out.println("Версия Windows = " + winVersion);

        long countOfMemInSSD = 1048576;//в мегабайтах
        System.out.println("Обьем памяти SSD (Мбайт) = " + countOfMemInSSD);

        float tempOfCPU = 32.0f;//температура процессора
        char temperature = 176;//знак градуса
        System.out.println("Температура процессора = " + tempOfCPU + " " + temperature + "C");

        double processorFrequency = 2.80;//частота процессора в Герцах
        System.out.println("Частота процессора (Гц) = " + processorFrequency);

        boolean isMouse = true; //наличие мышки
        if (isMouse = true) {
            System.out.println("Мышка на месте!");
        } else {
            System.out.println("Мышь отсутствует!");
        }
    }
}
