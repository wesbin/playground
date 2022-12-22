import {createRouter, createWebHistory} from 'vue-router';

const routes = [
  {
    path: '/',
  },
  {
    path: '/chat',
    component: () => import('@/components/chat/TestChat')
  },
  {
    path: '/view',
    component: () => import('@/components/View/TestView')
  },
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes,
})

export default router