package com.examen.slama;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



class MatriculaTest {
    
    @Test
    public void vectorNulo(){
        Matricula mat = new Matricula(null);
        assertThrows(Exception.class, () -> {mat.getImporte();});
    }
}
