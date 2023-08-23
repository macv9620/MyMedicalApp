package exceptions;

public class TestConexion {
    public static void main(String[] args) {
        try(Conexion con = new Conexion()){
            con.leerDatos();
        } catch (IllegalStateException e){
            e.printStackTrace();
        }
        /*Conexion con = null;
        try{
            con = new Conexion();
            con.leerDatos();
        } catch (IllegalStateException ise){
            ise.printStackTrace();
        } finally {
            if(con != null){
                con.cerrarConexion();
            }
        }*/
    }
}
