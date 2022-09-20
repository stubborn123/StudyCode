package com.example.test.snapshot;

import java.util.Stack;

/**
 * @Author: zhangpeng
 * @Description:
 * @Date: 2022/9/20
 */
public class SnapshotHolder {
    private Stack<Snapshot> snapshots = new Stack<>();

    public Snapshot popSnapshot() {
        return snapshots.pop();
    }

    public void pushSnapshot(Snapshot snapshot) {
        snapshots.push(snapshot);
    }
}
