import program
import unittest

class TestSum(unittest.TestCase):
    def test_integer(self):
        self.assertEqual(program.multiply(3, 3), 9)

if __name__ == '__main__':
    unittest.main()