/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto.grafos;

/**
 *
 * @author Admin
 */
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class GraphPopup extends JFrame {

    private Grafo grafo; // Clase que representa el grafo

    public GraphPopup(Grafo grafo) {
        this.grafo = grafo;
        setTitle("Ventana emergente del grafo");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(400, 400);
        setLocationRelativeTo(null);

        GraphPanel graphPanel = new GraphPanel();
        getContentPane().add(graphPanel);

        setVisible(true);
    }

    private class GraphPanel extends JPanel {

        @Override
        protected void paintComponent(Graphics g) {
    super.paintComponent(g);

    Graphics2D g2d = (Graphics2D) g;

    for (int i = 0; i < grafo.getNumNodos(); i++) {
        Vertice vertice = grafo.getVertices()[i];
        if (vertice != null) {
            int x = calcularCoordenadaX(i);
            int y = calcularCoordenadaY(i);

            // Dibujar el nodo
            g2d.drawOval(x, y, 20, 20);
            g2d.drawString(vertice.getUsername(), x, y);

            for (int j = i + 1; j < grafo.getNumNodos(); j++) {
                if (grafo.Arco(i, j)) {
                    Vertice otroVertice = grafo.getVertices()[j];
                    if (otroVertice != null) {
                        int otroX = calcularCoordenadaX(j);
                        int otroY = calcularCoordenadaY(j);

                        // Dibujar la arista
                        g2d.drawLine(x + 10, y + 10, otroX + 10, otroY + 10);
                        g2d.drawString(String.valueOf(grafo.getMatrizAd()[i][j]), (x + otroX) / 2, (y + otroY) / 2);
                    }
                }
            }
        }
    }
}

private int calcularCoordenadaX(int numVertice) {
    return (numVertice % 10) * 40 + 30;
}

private int calcularCoordenadaY(int numVertice) {
    return (numVertice / 10) * 40 + 30;
}

}
}

