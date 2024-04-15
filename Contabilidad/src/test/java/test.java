test.java

describe ('GIVEN a Bank Client Cuenta,' () => {

    test ('THEN I can create an isntance', () => {

        const sut = new Cuenta();
        expect(sut).toBeInstanceOf(BanckClient);
    });

    test ('THEN I can make a deposit', () => {

        const sut = new  ();
        sut.deposit ();
        expect(sut).toBeInstanceOf (Cuenta);
    });

    test ('WHEN I make a deposit of THEN it should returns the running balance of 10', () => {
        const sut = new Cuenta () ;
        const input = 10 ;
        const actual = sut.deposit(input) ;
        const expected = 10 ;
        expect(actual).toEqual( expected );
    });
});

//Implementación con el minimo código posible

export class Cuenta
{
    constructor () {}
    deposit (amount) {
        return 10;
    }
}