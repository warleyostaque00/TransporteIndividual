package com.example.transport;

public class ElectricTransportFactory implements TransportFactory {
    @Override
    public Transport createScooter() {
        return new ElectricScooter();
    }

    @Override
    public Transport createBike() {
        return new ElectricBike();
    }

    @Override
    public Transport createSkates() {
        throw new UnsupportedOperationException("Não estão disponiveis os patins na categoria transporte elétrico");
    }

    @Override
    public Transport createSkateboard() {
        throw new UnsupportedOperationException("Não estão disponiveis os skates na categoria transporte elétrico.");
    }
}
