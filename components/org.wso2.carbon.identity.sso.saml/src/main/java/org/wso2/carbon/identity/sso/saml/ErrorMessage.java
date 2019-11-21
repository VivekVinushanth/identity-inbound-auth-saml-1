/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.wso2.carbon.identity.sso.saml;

/**
 * Container for error codes related to OAuth component.
 */
public enum ErrorMessage {

    INVALID_REQUEST("70001"),
    CONFLICTING_SAML_ISSUER("70002");

    ErrorMessage(String errorCode) {

        this.errorCode = errorCode;
    }

    public String getErrorCode() {

        return SAML_PREFIX + "-" + errorCode;
    }

    private String errorCode;
    private static final String SAML_PREFIX = "SAML";
}
