package data;

import exceptions.nonValidStringException;
import exceptions.nullStringException;

/**
 * Essential data classes
 *  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
 */
final public class Nif {
    // The tax identification number in the Spanish state.
    private final String nif;
    public Nif (String code)  { this.nif = code; }
    public String getNif () throws nullStringException, nonValidStringException {
        if (nif == null) {
            throw new nullStringException("null nif");
        }
        if(!nif.matches("[+-]?\\d*(\\.\\d+)?")) {
            throw new nonValidStringException("invalid nif");
        }
        return nif;
    }

    @Override
    public boolean equals (Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nif niff = (Nif) o;
        return nif.equals(niff.nif);
    }

    @Override
    public int hashCode () { return nif.hashCode(); }

    @Override
    public String toString () {
        return "Nif{" + "nif ciudadano='" + nif + '\'' + '}';
    }
}
