package net.exyon.msapp.cucumber.stepdefs;

import net.exyon.msapp.MicroServiceApplicationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = MicroServiceApplicationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
