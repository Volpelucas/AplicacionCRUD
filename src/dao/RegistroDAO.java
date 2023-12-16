package dao;

import models.Registro;

import java.util.ArrayList;
import java.util.List;

public class RegistroDAO {
    private final List<Registro> registros = new ArrayList<>();
    private int nextId = 1;

    public void crearRegistro(Registro registro) {
        registro.setId(nextId++);
        registros.add(registro);
        System.out.println("Registro creado: " + registro);
    }

    public List<Registro> listarRegistros() {
        return new ArrayList<>(registros);
    }

    public void actualizarRegistro(Registro registro) {
        // Implementación para actualizar un registro existente
        System.out.println("Registro actualizado: " + registro);
    }

    public void borrarRegistro(int id) {
        // Implementación para borrar un registro por ID
        System.out.println("Registro eliminado con ID: " + id);
    }
}
