package spec;

public interface Specification {

    boolean isSatisfiedBy(Object o);

    Specification and(Specification specification);

    Specification or(Specification specification);

    Specification not(Specification specification);
}