package ru.danilov.s04;

public enum Alphabit {
    A(1),
    B(2),
    C(3),
    D(4),
    E(5),
    F(6),
    G(7),
    H(8),
    I(9),
    K(10),
    L(11),
    M(12),
    N(13),
    O(14),
    P(15),
    Q(16),
    R(17),
    S(18),
    T(19),
    V(20),
    X(21),
    Y(22),
    Z(23);
    int numberLetter;

    public int getNumberLetter() {
        return numberLetter;
    }

    Alphabit(int numberLetter) {
        this.numberLetter = numberLetter;
    }
}
