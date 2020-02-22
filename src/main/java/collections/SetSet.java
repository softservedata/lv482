package collections;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetSet {

	public <T> Set<T> union(Set<T> set1, Set<T> set2) {
		Set<T> uniSet = new HashSet<>();
		uniSet.addAll(set1);
		uniSet.addAll(set2);
		return uniSet;
	}

	public <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
		Set<T> uniSet = new HashSet<>();
		uniSet.addAll(set1);
		uniSet.addAll(set2);
		Set<T> unX = new HashSet<>(uniSet);
		unX.removeAll(set1);
		Set<T> unY = new HashSet<>(uniSet);
		unY.removeAll(set2);
		Set<T> intersection = new HashSet<>(uniSet);
		intersection.removeAll(unX);
		intersection.removeAll(unY);
		return intersection;

	}

	public static void main(String[] args) {

		Set set1 = new HashSet<>();
		Set set2 = new HashSet<>();

		Random rd = new Random();

		int set1Length = rd.nextInt(20);
		for (int i = 0; i <= set1Length; i++) {
			set1.add(rd.nextInt(40));
		}

		System.out.println("Set 1 is " + set1);

		int set2Length = rd.nextInt(20);
		for (int i = 0; i <= set2Length; i++) {
			set2.add(rd.nextInt(40));
		}

		System.out.println("Set 2 is " + set2);

		SetSet setUni = new SetSet();
		System.out.println(" There is an union set" + setUni.union(set1, set2));
		
		SetSet setInter = new SetSet();
		System.out.println(" There is an intersection set" + setUni.intersection(set1, set2));
	}

}
