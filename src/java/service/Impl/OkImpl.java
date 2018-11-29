package service.Impl;

import service.Ok;

public class OkImpl implements Ok {
    @Override
    public int getOk() {
        return 0;
    }

    public static void main(String[] args) {
        new OkImpl().sayHi();
    }
}
