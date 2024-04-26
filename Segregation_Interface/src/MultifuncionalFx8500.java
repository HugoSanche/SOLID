public class MultifuncionalFx8500 implements  MultifuncionalFxImpresion,MultifuncionalFxEscanea,MultifuncionalFxFaxea{

    @Override
    public boolean escanearDocumento() {
        //logical implementation
        return true;
    }


    @Override
    public boolean faxearDocumento() {
        //logical implementation
        return true;
    }

    @Override
    public boolean impprimeDocumento() {
        //logical implementation
        return true;
    }
}
