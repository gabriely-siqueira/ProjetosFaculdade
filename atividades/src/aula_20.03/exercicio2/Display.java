package exercicio2;

public class Display {
    private Numero horas;
    private Numero minutos;

    public Display() {
        this.horas = new Numero(24);
        this.minutos = new Numero(60);
    }

    public void tiqueTaque() {
        minutos.incremento();
        if (minutos.getValor() == 0) {
            horas.incremento();
        }
        updateDisplay();
    }

    public void updateDisplay() {
        String horaFormatada = String.format("%02d", horas.getValor());
        String minutosFormatados = String.format("%02d", minutos.getValor());
        System.out.println(horaFormatada + ":" + minutosFormatados);
    }

}
