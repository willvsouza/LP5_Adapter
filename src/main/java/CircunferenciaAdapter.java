public class CircunferenciaAdapter extends CircunferenciaGraus{

    private ICircunferencia circuferenciaRadianos;

    public CircunferenciaAdapter(ICircunferencia circuferenciaRadianos) {
        this.circuferenciaRadianos = circuferenciaRadianos;
    }

    public String resultado() {
        if (this.getGraus() >= 30)
            circuferenciaRadianos.setCircunferencia("π/6");
        else
        if (this.getGraus() >= 60)
            circuferenciaRadianos.setCircunferencia("π/4");
        else
        if (this.getGraus() >= 90)
            circuferenciaRadianos.setCircunferencia("π/2");
        else
        if (this.getGraus() >= 180)
            circuferenciaRadianos.setCircunferencia("π");
        else
        if (this.getGraus() >= 360)
            circuferenciaRadianos.setCircunferencia("2π");

        return circuferenciaRadianos.getCircunferencia();
    }

    public void salvarResultado() {
        if (circuferenciaRadianos.getCircunferencia().equals("π/6"))
            this.setGraus(30);
        else
        if (circuferenciaRadianos.getCircunferencia().equals("π/4"))
            this.setGraus(60);
        else
        if (circuferenciaRadianos.getCircunferencia().equals("π/2"))
            this.setGraus(90);
        else
        if (circuferenciaRadianos.getCircunferencia().equals("π"))
            this.setGraus(180);
        else
        if (circuferenciaRadianos.getCircunferencia().equals("2π"))
            this.setGraus(360);
    }
}
