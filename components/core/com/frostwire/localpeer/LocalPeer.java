/*
 * Created by Angel Leon (@gubatron), Alden Torres (aldenml)
 * Copyright (c) 2011-2014, FrostWire(R). All rights reserved.
 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.frostwire.localpeer;

/**
 * 
 * @author gubatron
 * @author aldenml
 *
 */
public final class LocalPeer {

    public LocalPeer(String address, int port, String nickname, int numSharedFiles, int deviceType, String clientVersion) {
        this.address = address;
        this.port = port;

        this.nickname = nickname;
        this.numSharedFiles = numSharedFiles;
        this.deviceType = deviceType;
        this.clientVersion = clientVersion;
    }

    /**
     * Constructor to allow pseudo-empty identification of LocalPeer when leaving
     * 
     * @param address
     * @param port
     */
    public LocalPeer(String address, int port) {
        this(address, port, null, 0, 0, null);
    }

    /**
     * Empty constructor for json serialization
     */
    public LocalPeer() {
        this(null, 0, null, 0, 0, null);
    }

    public final String address;
    public final int port;

    public final String nickname;
    public final int numSharedFiles;
    public final int deviceType;
    public final String clientVersion;

    public LocalPeer withAddress(String address) {
        return new LocalPeer(address, port, nickname, numSharedFiles, deviceType, clientVersion);
    }

    public LocalPeer withPort(int port) {
        return new LocalPeer(address, port, nickname, numSharedFiles, deviceType, clientVersion);
    }

    public LocalPeer withNumSharedFiles(int numSharedFiles) {
        return new LocalPeer(address, port, nickname, numSharedFiles, deviceType, clientVersion);
    }

    public String getKey() {
        return address + ":" + port;
    }
}
