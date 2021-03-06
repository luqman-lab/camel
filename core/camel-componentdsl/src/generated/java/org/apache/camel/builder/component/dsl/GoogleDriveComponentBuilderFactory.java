/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.builder.component.dsl;

import javax.annotation.Generated;
import org.apache.camel.Component;
import org.apache.camel.builder.component.AbstractComponentBuilder;
import org.apache.camel.builder.component.ComponentBuilder;
import org.apache.camel.component.google.drive.GoogleDriveComponent;

/**
 * The google-drive component provides access to Google Drive file storage
 * service.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.ComponentDslMojo")
public interface GoogleDriveComponentBuilderFactory {

    /**
     * Google Drive (camel-google-drive)
     * The google-drive component provides access to Google Drive file storage
     * service.
     * 
     * Category: api,cloud,file
     * Since: 2.14
     * Maven coordinates: org.apache.camel:camel-google-drive
     */
    static GoogleDriveComponentBuilder googleDrive() {
        return new GoogleDriveComponentBuilderImpl();
    }

    /**
     * Builder for the Google Drive component.
     */
    interface GoogleDriveComponentBuilder
            extends
                ComponentBuilder<GoogleDriveComponent> {
        /**
         * To use the shared configuration.
         * 
         * The option is a:
         * <code>org.apache.camel.component.google.drive.GoogleDriveConfiguration</code> type.
         * 
         * Group: common
         */
        default GoogleDriveComponentBuilder configuration(
                org.apache.camel.component.google.drive.GoogleDriveConfiguration configuration) {
            doSetProperty("configuration", configuration);
            return this;
        }
        /**
         * Allows for bridging the consumer to the Camel routing Error Handler,
         * which mean any exceptions occurred while the consumer is trying to
         * pickup incoming messages, or the likes, will now be processed as a
         * message and handled by the routing Error Handler. By default the
         * consumer will use the org.apache.camel.spi.ExceptionHandler to deal
         * with exceptions, that will be logged at WARN or ERROR level and
         * ignored.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: consumer
         */
        default GoogleDriveComponentBuilder bridgeErrorHandler(
                boolean bridgeErrorHandler) {
            doSetProperty("bridgeErrorHandler", bridgeErrorHandler);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default GoogleDriveComponentBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the component should use basic property binding (Camel 2.x)
         * or the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default GoogleDriveComponentBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * To use the GoogleCalendarClientFactory as factory for creating the
         * client. Will by default use BatchGoogleDriveClientFactory.
         * 
         * The option is a:
         * <code>org.apache.camel.component.google.drive.GoogleDriveClientFactory</code> type.
         * 
         * Group: advanced
         */
        default GoogleDriveComponentBuilder clientFactory(
                org.apache.camel.component.google.drive.GoogleDriveClientFactory clientFactory) {
            doSetProperty("clientFactory", clientFactory);
            return this;
        }
    }

    class GoogleDriveComponentBuilderImpl
            extends
                AbstractComponentBuilder<GoogleDriveComponent>
            implements
                GoogleDriveComponentBuilder {
        @Override
        protected GoogleDriveComponent buildConcreteComponent() {
            return new GoogleDriveComponent();
        }
        @Override
        protected boolean setPropertyOnComponent(
                Component component,
                String name,
                Object value) {
            switch (name) {
            case "configuration": ((GoogleDriveComponent) component).setConfiguration((org.apache.camel.component.google.drive.GoogleDriveConfiguration) value); return true;
            case "bridgeErrorHandler": ((GoogleDriveComponent) component).setBridgeErrorHandler((boolean) value); return true;
            case "lazyStartProducer": ((GoogleDriveComponent) component).setLazyStartProducer((boolean) value); return true;
            case "basicPropertyBinding": ((GoogleDriveComponent) component).setBasicPropertyBinding((boolean) value); return true;
            case "clientFactory": ((GoogleDriveComponent) component).setClientFactory((org.apache.camel.component.google.drive.GoogleDriveClientFactory) value); return true;
            default: return false;
            }
        }
    }
}