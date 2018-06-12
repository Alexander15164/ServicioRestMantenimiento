package sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.EquipoDetalle;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T18:50:23")
@StaticMetamodel(Marca.class)
public class Marca_ { 

    public static volatile SingularAttribute<Marca, String> descripcion;
    public static volatile SingularAttribute<Marca, Integer> idMarca;
    public static volatile SingularAttribute<Marca, String> nombre;
    public static volatile SingularAttribute<Marca, Boolean> activo;
    public static volatile CollectionAttribute<Marca, EquipoDetalle> equipoDetalleCollection;

}