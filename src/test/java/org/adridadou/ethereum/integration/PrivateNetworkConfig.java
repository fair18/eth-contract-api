package org.adridadou.ethereum.integration;

import org.adridadou.ethereum.values.EthAccount;
import org.adridadou.ethereum.values.EthValue;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by davidroon on 20.11.16.
 * This code is released under Apache 2 license
 */
public class PrivateNetworkConfig {
    private final Map<EthAccount, EthValue> initialBalances = new HashMap<>();

    public PrivateNetworkConfig initialBalance(final EthAccount account, final EthValue value) {
        initialBalances.put(account, value);
        return this;
    }

    public Map<EthAccount, EthValue> getInitialBalances() {
        return initialBalances;
    }

    public static PrivateNetworkConfig config() {
        return new PrivateNetworkConfig();
    }
}
