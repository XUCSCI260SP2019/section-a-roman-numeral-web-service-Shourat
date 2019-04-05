
package edu.xavier.csci.Shourat.RomanNumeral;


import edu.xavier.csci.RomanNumeralConverter;
import org.springframework.web.bind.annotation.*;

@RestController

public class CustomerController {


    @CrossOrigin(origins = "https://localhost:8080")
    @GetMapping("/decode/{id}")
    public ResponseSingleDecode encode(@PathVariable("id") String num) {
        ResponseSingleDecode response = new ResponseSingleDecode();
        RomanNumeralConverter r = new RomanNumeralConverter();
        response.setNumber(r.decode(num));
        return response;
    }
    @PostMapping("/decode")
    public ResponseSingleDecode decode(@RequestBody("id") String s){
        ResponseSingleDecode response = new ResponseSingleDecode();
        RomanNumeralConverter r = new RomanNumeralConverter();
        response.getNumber(r.encode(s));
        return response;
    }

    @CrossOrigin(origins = "https://localhost:8080")
    @GetMapping("/encode/{id}")
    public ResponseSingleEncode encode(@PathVariable("id") String num){
        ResponseSingleEncode response = new ResponseSingleEncode();
        RomanNumeralConverter r = new RomanNumeralConverter();
        response.setString(r.decode(num));
        return response;
    }
    @PostMapping("/encode")
    public ResponseSingleEncode decode(@RequestBody("id") String s){
        ResponseSingleEncode response = new ResponseSingleEncode();
        RomanNumeralConverter r = new RomanNumeralConverter();
        response.getString(r.encode(s));
        return response;
    }

    @CrossOrigins("https://localhost:8080")
    @GetMapping("/decode/{id}")
    public ResponseMultipleDecode encode(@PathVariable() String num) {
        ResponseMultipleDecode response = new ResponseMultipleDecode();
        RomanNumeralConverter r = new RomanNumeralConverter();
        response.setNum(r.decode(num));
        return response;
    }
    @PostMapping("/decode")
    public ResponseMultipleDecode decode(@RequestBody() String s) {
        ResponseMultipleDecode response = new ResponseMultipleDecode();
        RomanNumeralConverter r = new RomanNumeralConverter();
        response.getNum(r.encode(s));
        return response;
    }

    @CrossOrigin("https://localhost:8080")
    @GetMapping("/encode/{id}")
    public ResponseMultipleEncode encode(@PathVariable() String num){
        ResponseMultipleEncode response = new ResponseMultipleEncode();
        RomanNumeralConverter r = new RomanNumeralConverter();
        response.setList(r.decode(num));
        return response;
    }
    @PostMapping("/encode")
    public ResponseMultipleEncode decode(@RequestBody() String s){
        ResponseMultipleEncode response = new ResponseMultipleEncode();
        RomanNumeralConveter r = new RomanNumeralConverter();
        response.getS(r.encode(s));
        return response;
    }


}

