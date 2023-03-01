package modelo;

import modelo.Clases.Cliente;

public class ModeloCliente extends Cliente {

    public ModeloCliente() {
    }

    public ModeloCliente(int cli_id, String cli_direccion, String cli_telefono, int per_id, String per_ced, String per_nombre, String per_apellido1, String per_apellido2, String per_correo, int per_persona) {
        super(cli_id, cli_direccion, cli_telefono, per_id, per_ced, per_nombre, per_apellido1, per_apellido2, per_correo, per_persona);
    }

}
