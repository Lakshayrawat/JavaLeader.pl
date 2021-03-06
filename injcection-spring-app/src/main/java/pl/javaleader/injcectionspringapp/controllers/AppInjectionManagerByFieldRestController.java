package pl.javaleader.injcectionspringapp.controllers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pl.javaleader.injcectionspringapp.service.Printer;

@RestController
public class AppInjectionManagerByFieldRestController {

    @Autowired
    @Qualifier("printerImpl")
    private Printer printer;

    @GetMapping(path="/printerInjectedByField")
    @ResponseBody
    public String getPrinterInjectedByField() {
        return printer.print("printer injected by field");
    }
}
