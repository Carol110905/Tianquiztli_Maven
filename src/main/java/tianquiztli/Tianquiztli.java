package tianquiztli;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import static javax.swing.UIManager.getInstalledLookAndFeels;

/**
 *
 * @author jair1
 */
public class Tianquiztli {
    
   public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(VentanaLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaLogin().setVisible(true);
            }
        });
    }

        /*VisualizarProductos vp = new VisualizarProductos();
        vp.setVisible(true);
        vp.setLocationRelativeTo(null);
        VentanaLogin log = new VentanaLogin();
        log.setVisible(true);
        log.setLocationRelativeTo(null);
        
        /*PantallaRegistrarProductos pantallaRegistro = new PantallaRegistrarProductos();
        Producto_DAO producto_dao = new Producto_DAO();
        ControladorPantallaRegistrarProductos rpc = new ControladorPantallaRegistrarProductos(producto_dao, pantallaRegistro);
        //
        pantallaRegistro.setTitle("Tianquiztli");
        pantallaRegistro.setLocationRelativeTo(null);


        pantallaRegistro.setVisible(true);*/
    
}
