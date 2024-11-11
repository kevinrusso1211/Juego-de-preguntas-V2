/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BackEnd;

/**
 *
 * @author Kevin Russo Emiliany
 */
public class Pregunta {
    public String pregunta, opA, opB, opC, opCorrecta, opMarcada;
    
    public Pregunta(String pregunta, String opA, String opB, String opC, String opCorrecta) {
        this.pregunta = pregunta;
        this.opA = opA;
        this.opB = opB;
        this.opC = opC;
        this.opCorrecta = opCorrecta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getOpA() {
        return opA;
    }

    public void setOpA(String opA) {
        this.opA = opA;
    }

    public String getOpB() {
        return opB;
    }

    public void setOpB(String opB) {
        this.opB = opB;
    }

    public String getOpC() {
        return opC;
    }

    public void setOpC(String opC) {
        this.opC = opC;
    }

    public String getOpCorrecta() {
        return opCorrecta;
    }

    public void setOpCorrecta(String opCorrecta) {
        this.opCorrecta = opCorrecta;
    }

    public String getOpMarcada() {
        return opMarcada;
    }

    public void setOpMarcada(String opMarcada) {
        this.opMarcada = opMarcada;
    }

    @Override
    public String toString() {
        return "Pr{" + "pregunta=" + pregunta + ", opA=" + opA + ", opB=" + opB + ", opC=" + opC + ", opCorrecta=" + opCorrecta + '}';
    }
    
}
