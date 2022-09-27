import { createWebHistory, createRouter } from 'vue-router'

const routes = [
  {
    path: '/',
    name: 'Main',
    component: () => import('@/components/main/Main'),
  },
  {
    path: '/comics',
    name: 'Comics',
    component: () => import('@/components/main/Comics'),
  },
  {
    path: '/comics/:title',
    name: 'ComicIndex',
    component: () => import('@/components/post/comic/ComicIndex'),
  },
  {
    path: '/comics/:title/content',
    name: 'ComicContent',
    component: () => import('@/components/post/comic/ComicContent'),
  },
  {
    path: '/comics/:comicId/view/:episode',
    name: 'ComicView',
    component: () => import('@/components/post/comic/ComicView')
  },
  {
    path: '/music',
    name: 'Music',
    component: () => import('@/components/main/Music'),
  },
  {
    path: '/music/:musicId/info',
    name: 'MusicInfo',
    component: () => import('@/components/post/music/MusicInfo'),
    props: true,
  },
]

export default createRouter({
  history: createWebHistory(),
  routes
})