package sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Equipo;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Marca;
import sv.edu.ues.fmocc.ingenieria.tpi135.parcial2.entidades.Modelo;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-05-04T18:50:23")
@StaticMetamodel(EquipoDetalle.class)
public class EquipoDetalle_ { 

    public static volatile SingularAttribute<EquipoDetalle, Equipo> idEquipo;
    public static volatile SingularAttribute<EquipoDetalle, Long> idEquipoDetalle;
    public static volatile SingularAttribute<EquipoDetalle, Modelo> idModelo;
    public static volatile SingularAttribute<EquipoDetalle, Marca> idMarca;
    public static volatile SingularAttribute<EquipoDetalle, Integer> idParte;

}