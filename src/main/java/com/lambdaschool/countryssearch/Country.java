package com.lambdaschool.countryssearch;

import java.util.concurrent.atomic.AtomicLong;

public class Country
{
	private static final AtomicLong counter = new AtomicLong();
	private long id;
	private String name;
	private int population;
	private int landMass;
	private int avgAge;

	public Country(String name, int population, int landMass, int avgAge)
	{
		this.id = counter.incrementAndGet();
		this.name = name;
		this.population = population;
		this.landMass = landMass;
		this.avgAge = avgAge;
	}

	public long getId()
	{
		return id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getPopulation()
	{
		return population;
	}

	public void setPopulation(int population)
	{
		this.population = population;
	}

	public int getLandMass()
	{
		return landMass;
	}

	public void setLandMass(int landMass)
	{
		this.landMass = landMass;
	}

	public int getAvgAge()
	{
		return avgAge;
	}

	public void setAvgAge(int avgAge)
	{
		this.avgAge = avgAge;
	}
}
