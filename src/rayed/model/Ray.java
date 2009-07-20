package rayed.model;

import rayed.math.Vector3D;

public class Ray {
	private Vector3D origin;
	private Vector3D direction;
	
	public Ray(Vector3D origin, Vector3D direction) {
		this.origin = origin;
		this.direction = direction.normalized();
	}
	
	public Vector3D origin() {
		return origin;
	}
	
	public Vector3D direction() {
		return direction;
	}
}
