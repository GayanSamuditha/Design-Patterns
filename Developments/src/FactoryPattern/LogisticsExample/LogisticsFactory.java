package FactoryPattern.LogisticsExample;

import sun.plugin2.message.transport.Transport;

/**
 * @author Gayan Samuditha
 * @created 11/05/2020 - 6:15 PM
 */

public interface LogisticsFactory {
    public Transport createTransport(String type);
}