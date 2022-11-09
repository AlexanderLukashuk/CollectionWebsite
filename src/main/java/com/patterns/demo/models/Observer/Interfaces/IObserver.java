package com.patterns.demo.models.Observer.Interfaces;

public interface IObserver {

    public void Update();

    public void SetSubject(ISubject sub);
}
