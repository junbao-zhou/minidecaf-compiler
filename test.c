int add(int a, int b)
{
	return 2 * a + b;
}
int main()
{
	int i = 1;
	return add((i = i + 1), (i = i + 1));
}