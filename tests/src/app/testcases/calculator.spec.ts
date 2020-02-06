import { Calculator } from "./calculator"

// test suites/group
// xdescribe("Testing function calc1 of Calculator", ()=>{
describe("Testing function calc1 of Calculator", ()=>{

    beforeAll(()=>{
        // will execute once before the test cases are executed in a test suite
    }) 

    beforeEach(()=>{
        // will execute before each test in a test suite
    })

    
    
    afterAll(()=>{
         // will execute once after all the test cases are executed in a test suite
    })
    
    afterEach(()=>{
        // will execute after each test in a test suite
    })

    // add test cases
    // xit('Testing calc1 for negative values', ()=>{
    it('Testing calc1 for negative values', ()=>{    
        // test code
        let calc = new Calculator();
        let response = calc.calc1(-5);
        // expect(<real value>).matchers(<Expected value>);
        expect(response).toBe(0);
    })

    it('Testing calc1 for positive values', ()=>{
        let calc = new Calculator();
        let response = calc.calc1(5);
        // expect(<real value>).matchers(<Expected value>);
        expect(response).toBe(6);
    })

    it('Testing calc2', ()=>{    
        // test code
        let calc = new Calculator();
        let response = calc.calc2(25);
        // expect(<real value>).matchers(<Expected value>);
        expect(response).toBe(5);
    })

    

})