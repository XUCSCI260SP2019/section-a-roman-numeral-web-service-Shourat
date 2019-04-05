
package edu.xavier.csci.Shourat.RomanNumeral;


import edu.xavier.csci.RomanNumeralConverter;
import org.springframework.web.bind.annotation.*;

@RestController

public class CustomerController {


    @CrossOrigin(origins = "https://localhost:8080")
    @GetMapping("/decode/{id}")
    public ResponseSingleDecode encode(@PathVariable("id") String num) {
        ResponseSingleDecode response = new ResponseSingleDecode();
       //RomanNumeralConverter = new RomanNumeralConverter();
        response.setNumber(RomanNumeralConverter.decode(num));
        return response;
    }
    @PostMapping("/decode")
    public ResponseSingleDecode decode(@RequestBody() String s){
        ResponseSingleDecode response = new ResponseSingleDecode();
        response.getNumber(RomanNumeralConverter.encode(s));
        return response;
    }
    @CrossOrigin(origins = "https://localhost:8080")
    @GetMapping("/encode/{id}")
    public ResponseSingleEncode decode(@PathVariable("id") String num){
        ResponseSingleEncode response = new ResponseSingleEncode();
        response.setString(RomanNumeralConverter.decode(num));
        return response;
    }
    @PostMapping("/encode")
    public ResponseSingleEncode decode(@RequestBody() String s){
        ResponseSingleEncode response = new ResponseSingleEncode();
        response.getString(RomanNumeralConverter.encode(s));
        return response;
    }

    @GetMapping("/decode/{id}")
    public ResponseMultipleDecode decode(@PathVariable() String num) {
        ResponseMultipleDecode response = new ResponseMultipleDecode();
        response.setNum(RomanNumeralConverter.encode(num));
        return response;
    }
    @PostMapping("/decode")
    public ResponseMultipleDecode decode(@RequestBody() String s) {
        ResponseMultipleDecode response = new ResponseMultipleDecode();
        response.getNum(RomanNumeralConverter.encode(s));
        return response;
    }
    @GetMapping("/encode/{id}")
    public ResponseMultipleEncode decode(@PathVariable() String num){
        ResponseMultipleEncode response = new ResponseMultipleEncode();
        response.setList(RomanNumeralConverter.encode(num));
        return response;
    }
    @PostMapping("/encode")
    public ResponseMultipleEncode encode(@RequestBody() String s){
        ResponseMultipleEncode response = new ResponseMultipleEncode();
        response.getS(RomanNumeralConverter.decode(s));
        return response;
    }




}

