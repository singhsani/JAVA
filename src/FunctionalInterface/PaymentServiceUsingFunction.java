package FunctionalInterface;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class PaymentServiceUsingFunction {
    // Strategy Map: Key is mode, Value is the logic (Function)
    public static final Map<String, Function<Double, Double>> PAYMENT_METHOD = new HashMap<>();

    static {
        PAYMENT_METHOD.put("UPI", amt -> amt * 0.02);
        PAYMENT_METHOD.put("CREDIT_CARD", amt -> amt * 0.03); // Thoda badal dete hain values
        PAYMENT_METHOD.put("NET_BANKING", amt -> amt * 0.05);
        PAYMENT_METHOD.put("DEBIT_CARD", amt -> amt * 0.01);
    }

    // Instance Method to execute payment logic
    public double executeProcess(String type, Double amount) {
        // Higher Order Function use ho raha hai: Map se function nikal kar wahi apply kar rahe hain
        return PAYMENT_METHOD.getOrDefault(type, amt -> 0.0).apply(amount);
    }

    // Higher Order Function: Jo ek Function RETURN karta hai
    public static Function<Double, Double> getTaxProcess(double taxRate) {
        return amount -> amount * (taxRate / 100);
    }

    public static void main(String[] args) {
        // 1. Testing Tax Processor (Function returning a Function)
        Function<Double, Double> taxCalculator = getTaxProcess(18.0);
        System.out.println("GST Amount: " + taxCalculator.apply(10000.0)); // Output: 1800.0

        // 2. Testing Payment Strategies (Function as Data in Map)
        PaymentServiceUsingFunction service = new PaymentServiceUsingFunction();
        double upiFee = service.executeProcess("UPI", 1000.0);
        System.out.println("UPI Fee: " + upiFee); // Output: 20.0
    }

}
