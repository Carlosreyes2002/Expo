import java.util.ArrayList;
import java.util.List;

class Grupo implements Component {
    private List<Component> componentes = new ArrayList<>();

    public void agregarComponente(Component componente) {
        componentes.add(componente);
    }

    @Override
    public void dibujar() {
        // Dibujar cada componente en el grupo
        System.out.println("Dibujando un grupo:");
        for (Component componente : componentes) {
            componente.dibujar();
        }
    }
}
