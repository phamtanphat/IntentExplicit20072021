package com.example.intentexplicit20072021;

import android.os.Parcel;
import android.os.Parcelable;

public class Client implements Parcelable {
    String id;
    String name;

    public Client(String id, String name) {
        this.id = id;
        this.name = name;
    }

    protected Client(Parcel in) {
        id = in.readString();
        name = in.readString();
    }

    public static final Creator<Client> CREATOR = new Creator<Client>() {
        @Override
        public Client createFromParcel(Parcel in) {
            return new Client(in);
        }

        @Override
        public Client[] newArray(int size) {
            return new Client[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(id);
        parcel.writeString(name);
    }
}
