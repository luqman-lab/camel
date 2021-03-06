/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.yammer;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class YammerComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        YammerComponent target = (YammerComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "config": target.setConfig(property(camelContext, org.apache.camel.component.yammer.YammerConfiguration.class, value)); return true;
        case "requestor": target.setRequestor(property(camelContext, org.apache.camel.component.yammer.ApiRequestor.class, value)); return true;
        case "accesstoken":
        case "accessToken": target.setAccessToken(property(camelContext, java.lang.String.class, value)); return true;
        case "consumerkey":
        case "consumerKey": target.setConsumerKey(property(camelContext, java.lang.String.class, value)); return true;
        case "consumersecret":
        case "consumerSecret": target.setConsumerSecret(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

