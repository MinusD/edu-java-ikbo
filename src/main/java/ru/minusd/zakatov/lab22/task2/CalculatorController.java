package ru.minusd.zakatov.lab22.task2;

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorController(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
        this.view.setController(this);
    }

    public void updateModel(String ch) {
        model.setExpression(model.getExpression() + ch);
        updateView();
    }

    public void updateView() {
        view.updateView(model.getExpression());
    }

    public void calculate() {
        model.calculate();
        updateView();
    }
}
